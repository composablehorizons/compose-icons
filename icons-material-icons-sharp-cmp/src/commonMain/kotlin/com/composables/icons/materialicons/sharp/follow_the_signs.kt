package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Follow_the_signs: ImageVector
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
                lineTo(3f, 23f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.75f, -8f)
                lineTo(9f, 17f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.55f)
                lineTo(8.95f, 13.4f)
                lineToRelative(0.6f, -3f)
                curveTo(10.85f, 12f, 12.8f, 13f, 15f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.85f, 0f, -3.45f, -1f, -4.35f, -2.45f)
                lineTo(9.7f, 6.95f)
                curveTo(9.35f, 6.35f, 8.7f, 6f, 8f, 6f)
                curveTo(7.75f, 6f, 7.5f, 6.05f, 7.25f, 6.15f)
                lineTo(2f, 8.3f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.65f)
                lineTo(5.75f, 8.9f)
                moveTo(13f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                close()
                moveTo(18.01f, 8f)
                verticalLineTo(6.25f)
                horizontalLineTo(14.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.51f)
                verticalLineTo(3f)
                lineToRelative(2.49f, 2.5f)
                lineTo(18.01f, 8f)
                close()
            }
        }.build()
        
        return _Follow_the_signs!!
    }

private var _Follow_the_signs: ImageVector? = null

