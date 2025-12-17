package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Front_hand: ImageVector
    get() {
        if (_Front_hand != null) return _Front_hand!!
        
        _Front_hand = ImageVector.Builder(
            name = "front_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 15.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveTo(6f, 19.09f, 6f, 15.5f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(7f, 6.72f, 7f, 7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(10f, 3.72f, 10f, 4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(2.5f)
                curveTo(12f, 2.22f, 12.22f, 2f, 12.5f, 2f)
                reflectiveCurveTo(13f, 2.22f, 13f, 2.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(2f)
                verticalLineTo(4.5f)
                curveTo(15f, 4.22f, 15.22f, 4f, 15.5f, 4f)
                reflectiveCurveTo(16f, 4.22f, 16f, 4.5f)
                verticalLineToRelative(8.92f)
                curveToRelative(-1.77f, 0.77f, -3f, 2.53f, -3f, 4.58f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.5f, 8f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.02f, -0.5f, 0.05f)
                verticalLineTo(4.5f)
                curveTo(18f, 3.12f, 16.88f, 2f, 15.5f, 2f)
                curveToRelative(-0.19f, 0f, -0.37f, 0.02f, -0.54f, 0.06f)
                curveTo(14.75f, 0.89f, 13.73f, 0f, 12.5f, 0f)
                curveToRelative(-1.06f, 0f, -1.96f, 0.66f, -2.33f, 1.59f)
                curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f)
                curveTo(8.12f, 1.5f, 7f, 2.62f, 7f, 4f)
                verticalLineToRelative(0.55f)
                curveTo(6.84f, 4.52f, 6.67f, 4.5f, 6.5f, 4.5f)
                curveTo(5.12f, 4.5f, 4f, 5.62f, 4f, 7f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                verticalLineToRelative(-5f)
                curveTo(21f, 9.12f, 19.88f, 8f, 18.5f, 8f)
                close()
                moveTo(19f, 15.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveTo(6f, 19.09f, 6f, 15.5f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(7f, 6.72f, 7f, 7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(10f, 3.72f, 10f, 4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(2.5f)
                curveTo(12f, 2.22f, 12.22f, 2f, 12.5f, 2f)
                reflectiveCurveTo(13f, 2.22f, 13f, 2.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(2f)
                verticalLineTo(4.5f)
                curveTo(15f, 4.22f, 15.22f, 4f, 15.5f, 4f)
                reflectiveCurveTo(16f, 4.22f, 16f, 4.5f)
                verticalLineToRelative(8.92f)
                curveToRelative(-1.77f, 0.77f, -3f, 2.53f, -3f, 4.58f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()
        
        return _Front_hand!!
    }

private var _Front_hand: ImageVector? = null

