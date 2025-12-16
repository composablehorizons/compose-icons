package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Inbox: ImageVector
    get() {
        if (_Inbox != null) return _Inbox!!
        
        _Inbox = ImageVector.Builder(
            name = "inbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 1f)
                curveTo(2.11929f, 1f, 1f, 2.11929f, 1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.8807f, 2.11929f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 15f, 15f, 13.8807f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.11929f, 13.8807f, 1f, 12.5f, 1f)
                horizontalLineTo(3.5f)
                close()
                moveTo(14f, 8f)
                horizontalLineTo(10.5f)
                lineTo(10.4101f, 8.00806f)
                curveTo(10.1769f, 8.05039f, 10f, 8.25454f, 10f, 8.5f)
                curveTo(10f, 8.55217f, 9.99216f, 8.66189f, 9.96774f, 8.80843f)
                curveTo(9.92659f, 9.05536f, 9.85276f, 9.30145f, 9.74029f, 9.52639f)
                curveTo(9.43156f, 10.1439f, 8.89734f, 10.5f, 8f, 10.5f)
                curveTo(7.10266f, 10.5f, 6.56844f, 10.1439f, 6.25971f, 9.52639f)
                curveTo(6.14724f, 9.30145f, 6.07341f, 9.05536f, 6.03226f, 8.80843f)
                curveTo(6.00784f, 8.66189f, 6f, 8.55217f, 6f, 8.5f)
                curveTo(6f, 8.22386f, 5.77614f, 8f, 5.5f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.67157f, 2.67157f, 2f, 3.5f, 2f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 2f, 14f, 2.67157f, 14f, 3.5f)
                verticalLineTo(8f)
                close()
                moveTo(2f, 9f)
                horizontalLineTo(5.044f)
                lineTo(5.0794f, 9.17401f)
                curveTo(5.1363f, 9.42568f, 5.22762f, 9.69828f, 5.36529f, 9.97361f)
                curveTo(5.83781f, 10.9186f, 6.70984f, 11.5f, 8f, 11.5f)
                curveTo(9.29016f, 11.5f, 10.1622f, 10.9186f, 10.6347f, 9.97361f)
                lineTo(10.7295f, 9.76791f)
                curveTo(10.8159f, 9.56329f, 10.8779f, 9.36276f, 10.9206f, 9.17401f)
                lineTo(10.955f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(12.5f)
                curveTo(14f, 13.3284f, 13.3284f, 14f, 12.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 14f, 2f, 13.3284f, 2f, 12.5f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Inbox!!
    }

private var _Inbox: ImageVector? = null

