package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Follow_the_signs: ImageVector
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
                moveTo(17.64f, 7.75f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3.51f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(3.51f)
                verticalLineTo(2.75f)
                lineToRelative(2.49f, 2.5f)
                lineTo(17.64f, 7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.12f, 5.25f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(8.02f, 5.25f, 9.12f, 5.25f)
                close()
                moveTo(5.38f, 8.65f)
                lineToRelative(-2.75f, 14.1f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.75f, -8f)
                lineToRelative(2.15f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(15.2f)
                lineToRelative(-2.05f, -2.05f)
                lineToRelative(0.6f, -3f)
                curveToRelative(1.3f, 1.6f, 3.25f, 2.6f, 5.45f, 2.6f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.85f, 0f, -3.45f, -1f, -4.35f, -2.45f)
                lineTo(9.32f, 6.7f)
                curveToRelative(-0.35f, -0.6f, -1f, -0.95f, -1.7f, -0.95f)
                curveToRelative(-0.25f, 0f, -0.5f, 0.05f, -0.75f, 0.15f)
                lineTo(1.62f, 8.05f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.4f)
                lineTo(5.38f, 8.65f)
                moveTo(12.62f, 1.75f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(-7f)
                horizontalLineTo(12.62f)
                close()
                moveTo(17.64f, 7.75f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3.51f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(3.51f)
                verticalLineTo(2.75f)
                lineToRelative(2.49f, 2.5f)
                lineTo(17.64f, 7.75f)
                close()
            }
        }.build()
        
        return _Follow_the_signs!!
    }

private var _Follow_the_signs: ImageVector? = null

