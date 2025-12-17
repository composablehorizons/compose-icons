package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Cat: ImageVector
    get() {
        if (_Cat != null) return _Cat!!
        
        _Cat = ImageVector.Builder(
            name = "cat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(290.59f, 192f)
                curveToRelative(-20.18f, 0f, -106.82f, 1.98f, -162.59f, 85.95f)
                verticalLineTo(192f)
                curveToRelative(0f, -52.94f, -43.06f, -96f, -96f, -96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                curveToRelative(17.64f, 0f, 32f, 14.36f, 32f, 32f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 35.3f, 28.7f, 64f, 64f, 64f)
                horizontalLineToRelative(176f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-32f)
                lineToRelative(128f, -96f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(289.86f)
                curveToRelative(-10.29f, 2.67f, -20.89f, 4.54f, -32f, 4.54f)
                curveToRelative(-61.81f, 0f, -113.52f, -44.05f, -125.41f, -102.4f)
                close()
                moveTo(448f, 96f)
                horizontalLineToRelative(-64f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(134.4f)
                curveToRelative(0f, 53.02f, 42.98f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -42.98f, 96f, -96f)
                verticalLineTo(32f)
                lineToRelative(-64f, 64f)
                close()
                moveToRelative(-72f, 80f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
                moveToRelative(80f, 0f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _Cat!!
    }

private var _Cat: ImageVector? = null

