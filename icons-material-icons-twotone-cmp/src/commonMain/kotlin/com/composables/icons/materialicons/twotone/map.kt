package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
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
                moveTo(5f, 18.31f)
                lineToRelative(3f, -1.16f)
                verticalLineTo(5.45f)
                lineTo(5f, 6.46f)
                close()
                moveToRelative(11f, 0.24f)
                lineToRelative(3f, -1.01f)
                verticalLineTo(5.69f)
                lineToRelative(-3f, 1.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.5f, 3f)
                lineToRelative(-0.16f, 0.03f)
                lineTo(15f, 5.1f)
                lineTo(9f, 3f)
                lineTo(3.36f, 4.9f)
                curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f)
                verticalLineTo(20.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineToRelative(0.16f, -0.03f)
                lineTo(9f, 18.9f)
                lineToRelative(6f, 2.1f)
                lineToRelative(5.64f, -1.9f)
                curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(8f, 17.15f)
                lineToRelative(-3f, 1.16f)
                verticalLineTo(6.46f)
                lineToRelative(3f, -1.01f)
                verticalLineToRelative(11.7f)
                close()
                moveToRelative(6f, 1.38f)
                lineToRelative(-4f, -1.4f)
                verticalLineTo(5.47f)
                lineToRelative(4f, 1.4f)
                verticalLineToRelative(11.66f)
                close()
                moveToRelative(5f, -0.99f)
                lineToRelative(-3f, 1.01f)
                verticalLineTo(6.86f)
                lineToRelative(3f, -1.16f)
                verticalLineToRelative(11.84f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

