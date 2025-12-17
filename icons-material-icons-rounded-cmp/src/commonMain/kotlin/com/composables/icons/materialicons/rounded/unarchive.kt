package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Unarchive: ImageVector
    get() {
        if (_Unarchive != null) return _Unarchive!!
        
        _Unarchive = ImageVector.Builder(
            name = "unarchive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.55f, 5.22f)
                lineToRelative(-1.39f, -1.68f)
                curveTo(18.88f, 3.21f, 18.47f, 3f, 18f, 3f)
                horizontalLineTo(6f)
                curveToRelative(-0.47f, 0f, -0.88f, 0.21f, -1.15f, 0.55f)
                lineTo(3.46f, 5.22f)
                curveTo(3.17f, 5.57f, 3f, 6.01f, 3f, 6.5f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -0.49f, -0.17f, -0.93f, -0.45f, -1.28f)
                close()
                moveToRelative(-8.2f, 4.63f)
                lineTo(17.5f, 15f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineTo(6.5f)
                lineToRelative(5.15f, -5.15f)
                curveToRelative(0.19f, -0.19f, 0.51f, -0.19f, 0.7f, 0f)
                close()
                moveTo(5.12f, 5f)
                lineToRelative(0.82f, -1f)
                horizontalLineToRelative(12f)
                lineToRelative(0.93f, 1f)
                horizontalLineTo(5.12f)
                close()
            }
        }.build()
        
        return _Unarchive!!
    }

private var _Unarchive: ImageVector? = null

