package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Church: ImageVector
    get() {
        if (_Church != null) return _Church!!
        
        _Church = ImageVector.Builder(
            name = "church",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464.46f, 246.68f)
                lineTo(352f, 179.2f)
                verticalLineTo(128f)
                horizontalLineToRelative(48f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-48f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-48f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(51.2f)
                lineToRelative(-112.46f, 67.48f)
                arcTo(31.997f, 31.997f, 0f, false, false, 160f, 274.12f)
                verticalLineTo(512f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -35.35f, 28.65f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.65f, 64f, 64f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(96f)
                verticalLineTo(274.12f)
                curveToRelative(0f, -11.24f, -5.9f, -21.66f, -15.54f, -27.44f)
                close()
                moveTo(0f, 395.96f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(112f)
                verticalLineTo(320f)
                lineTo(19.39f, 366.54f)
                arcTo(32.024f, 32.024f, 0f, false, false, 0f, 395.96f)
                close()
                moveToRelative(620.61f, -29.42f)
                lineTo(512f, 320f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(112f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(395.96f)
                curveToRelative(0f, -12.8f, -7.63f, -24.37f, -19.39f, -29.42f)
                close()
            }
        }.build()
        
        return _Church!!
    }

private var _Church: ImageVector? = null

