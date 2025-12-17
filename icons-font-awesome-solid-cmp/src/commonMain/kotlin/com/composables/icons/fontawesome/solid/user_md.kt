package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserMd: ImageVector
    get() {
        if (_UserMd != null) return _UserMd!!
        
        _UserMd = ImageVector.Builder(
            name = "user-md",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 256f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                reflectiveCurveTo(294.7f, 0f, 224f, 0f)
                reflectiveCurveTo(96f, 57.3f, 96f, 128f)
                reflectiveCurveToRelative(57.3f, 128f, 128f, 128f)
                close()
                moveTo(104f, 424f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.7f, 24f, -24f)
                reflectiveCurveToRelative(-10.7f, -24f, -24f, -24f)
                reflectiveCurveToRelative(-24f, 10.7f, -24f, 24f)
                close()
                moveToRelative(216f, -135.4f)
                verticalLineToRelative(49f)
                curveToRelative(36.5f, 7.4f, 64f, 39.8f, 64f, 78.4f)
                verticalLineToRelative(41.7f)
                curveToRelative(0f, 7.6f, -5.4f, 14.2f, -12.9f, 15.7f)
                lineToRelative(-32.2f, 6.4f)
                curveToRelative(-4.3f, 0.9f, -8.5f, -1.9f, -9.4f, -6.3f)
                lineToRelative(-3.1f, -15.7f)
                curveToRelative(-0.9f, -4.3f, 1.9f, -8.6f, 6.3f, -9.4f)
                lineToRelative(19.3f, -3.9f)
                verticalLineTo(416f)
                curveToRelative(0f, -62.8f, -96f, -65.1f, -96f, 1.9f)
                verticalLineToRelative(26.7f)
                lineToRelative(19.3f, 3.9f)
                curveToRelative(4.3f, 0.9f, 7.1f, 5.1f, 6.3f, 9.4f)
                lineToRelative(-3.1f, 15.7f)
                curveToRelative(-0.9f, 4.3f, -5.1f, 7.1f, -9.4f, 6.3f)
                lineToRelative(-31.2f, -4.2f)
                curveToRelative(-7.9f, -1.1f, -13.8f, -7.8f, -13.8f, -15.9f)
                verticalLineTo(416f)
                curveToRelative(0f, -38.6f, 27.5f, -70.9f, 64f, -78.4f)
                verticalLineToRelative(-45.2f)
                curveToRelative(-2.2f, 0.7f, -4.4f, 1.1f, -6.6f, 1.9f)
                curveToRelative(-18f, 6.3f, -37.3f, 9.8f, -57.4f, 9.8f)
                reflectiveCurveToRelative(-39.4f, -3.5f, -57.4f, -9.8f)
                curveToRelative(-7.4f, -2.6f, -14.9f, -4.2f, -22.6f, -5.2f)
                verticalLineToRelative(81.6f)
                curveToRelative(23.1f, 6.9f, 40f, 28.1f, 40f, 53.4f)
                curveToRelative(0f, 30.9f, -25.1f, 56f, -56f, 56f)
                reflectiveCurveToRelative(-56f, -25.1f, -56f, -56f)
                curveToRelative(0f, -25.3f, 16.9f, -46.5f, 40f, -53.4f)
                verticalLineToRelative(-80.4f)
                curveTo(48.5f, 301f, 0f, 355.8f, 0f, 422.4f)
                verticalLineToRelative(44.8f)
                curveTo(0f, 491.9f, 20.1f, 512f, 44.8f, 512f)
                horizontalLineToRelative(358.4f)
                curveToRelative(24.7f, 0f, 44.8f, -20.1f, 44.8f, -44.8f)
                verticalLineToRelative(-44.8f)
                curveToRelative(0f, -72f, -56.8f, -130.3f, -128f, -133.8f)
                close()
            }
        }.build()
        
        return _UserMd!!
    }

private var _UserMd: ImageVector? = null

