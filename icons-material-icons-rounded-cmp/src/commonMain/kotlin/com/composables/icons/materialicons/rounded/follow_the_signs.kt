package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Follow_the_signs: ImageVector
    get() {
        if (_Follow_the_signs != null) return _Follow_the_signs!!
        
        _Follow_the_signs = ImageVector.Builder(
            name = "follow_the_signs",
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
                moveTo(9.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(8.4f, 5.5f, 9.5f, 5.5f)
                close()
                moveTo(5.75f, 8.9f)
                lineTo(3.23f, 21.81f)
                curveTo(3.11f, 22.43f, 3.58f, 23f, 4.21f, 23f)
                horizontalLineTo(4.3f)
                curveToRelative(0.47f, 0f, 0.88f, -0.33f, 0.98f, -0.79f)
                lineTo(6.85f, 15f)
                lineTo(9f, 17f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.14f)
                curveToRelative(0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineTo(8.95f, 13.4f)
                lineToRelative(0.6f, -3f)
                curveToRelative(1.07f, 1.32f, 2.58f, 2.23f, 4.31f, 2.51f)
                curveToRelative(0.6f, 0.1f, 1.14f, -0.39f, 1.14f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.49f, -0.36f, -0.9f, -0.84f, -0.98f)
                curveToRelative(-1.49f, -0.25f, -2.75f, -1.15f, -3.51f, -2.38f)
                lineTo(9.7f, 6.95f)
                curveTo(9.35f, 6.35f, 8.7f, 6f, 8f, 6f)
                curveTo(7.75f, 6f, 7.5f, 6.05f, 7.25f, 6.15f)
                lineToRelative(-4.63f, 1.9f)
                curveTo(2.25f, 8.2f, 2f, 8.57f, 2f, 8.97f)
                verticalLineTo(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(9.65f)
                lineTo(5.75f, 8.9f)
                moveTo(21f, 2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(13.25f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(3f)
                curveTo(22f, 2.45f, 21.55f, 2f, 21f, 2f)
                close()
                moveTo(20.15f, 5.85f)
                lineToRelative(-1.28f, 1.29f)
                curveToRelative(-0.31f, 0.32f, -0.85f, 0.09f, -0.85f, -0.35f)
                verticalLineTo(6.25f)
                horizontalLineToRelative(-2.76f)
                curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.76f)
                verticalLineTo(4.21f)
                curveToRelative(0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f)
                lineToRelative(1.28f, 1.29f)
                curveTo(20.34f, 5.34f, 20.34f, 5.66f, 20.15f, 5.85f)
                close()
            }
        }.build()
        
        return _Follow_the_signs!!
    }

private var _Follow_the_signs: ImageVector? = null

