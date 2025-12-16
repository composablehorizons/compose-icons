package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Vr: ImageVector
    get() {
        if (_Vr != null) return _Vr!!
        
        _Vr = ImageVector.Builder(
            name = "vr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 7.5f)
                curveTo(6.5f, 7.776f, 6.276f, 8f, 6f, 8f)
                horizontalLineTo(4f)
                curveTo(3.724f, 8f, 3.5f, 7.776f, 3.5f, 7.5f)
                curveTo(3.5f, 7.224f, 3.724f, 7f, 4f, 7f)
                horizontalLineTo(6f)
                curveTo(6.276f, 7f, 6.5f, 7.224f, 6.5f, 7.5f)
                close()
                moveTo(12f, 7f)
                horizontalLineTo(10f)
                curveTo(9.724f, 7f, 9.5f, 7.224f, 9.5f, 7.5f)
                curveTo(9.5f, 7.776f, 9.724f, 8f, 10f, 8f)
                horizontalLineTo(12f)
                curveTo(12.276f, 8f, 12.5f, 7.776f, 12.5f, 7.5f)
                curveTo(12.5f, 7.224f, 12.276f, 7f, 12f, 7f)
                close()
                moveTo(16f, 6.5f)
                verticalLineTo(8.5f)
                curveTo(16f, 8.776f, 15.776f, 9f, 15.5f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(10.295f)
                curveTo(15f, 11.787f, 13.786f, 13f, 12.295f, 13f)
                horizontalLineTo(10.705f)
                curveTo(9.773f, 13f, 8.922f, 12.524f, 8.427f, 11.727f)
                curveTo(8.253f, 11.448f, 7.747f, 11.448f, 7.573f, 11.727f)
                curveTo(7.078f, 12.524f, 6.226f, 13f, 5.295f, 13f)
                horizontalLineTo(3.705f)
                curveTo(2.214f, 13f, 1f, 11.787f, 1f, 10.295f)
                verticalLineTo(9f)
                horizontalLineTo(0.5f)
                curveTo(0.224f, 9f, 0f, 8.776f, 0f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(0f, 6.224f, 0.224f, 6f, 0.5f, 6f)
                horizontalLineTo(1f)
                verticalLineTo(5.705f)
                curveTo(1f, 4.213f, 2.214f, 3f, 3.705f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(2.5f)
                curveTo(6f, 2.224f, 6.224f, 2f, 6.5f, 2f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 2f, 10f, 2.224f, 10f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(12.295f)
                curveTo(13.786f, 3f, 15f, 4.213f, 15f, 5.705f)
                verticalLineTo(6f)
                horizontalLineTo(15.5f)
                curveTo(15.776f, 6f, 16f, 6.224f, 16f, 6.5f)
                close()
                moveTo(14f, 5.705f)
                curveTo(14f, 4.765f, 13.235f, 4f, 12.295f, 4f)
                horizontalLineTo(3.705f)
                curveTo(2.765f, 4f, 2f, 4.765f, 2f, 5.705f)
                verticalLineTo(10.295f)
                curveTo(2f, 11.235f, 2.765f, 12f, 3.705f, 12f)
                horizontalLineTo(5.295f)
                curveTo(5.878f, 12f, 6.412f, 11.701f, 6.724f, 11.199f)
                curveTo(6.992f, 10.768f, 7.481f, 10.5f, 8f, 10.5f)
                curveTo(8.519f, 10.5f, 9.009f, 10.768f, 9.276f, 11.199f)
                curveTo(9.588f, 11.7f, 10.122f, 12f, 10.705f, 12f)
                horizontalLineTo(12.295f)
                curveTo(13.235f, 12f, 14f, 11.235f, 14f, 10.295f)
                verticalLineTo(5.705f)
                close()
            }
        }.build()
        
        return _Vr!!
    }

private var _Vr: ImageVector? = null

