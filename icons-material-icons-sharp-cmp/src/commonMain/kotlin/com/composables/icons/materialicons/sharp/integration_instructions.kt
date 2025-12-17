package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Integration_instructions: ImageVector
    get() {
        if (_Integration_instructions != null) return _Integration_instructions!!
        
        _Integration_instructions = ImageVector.Builder(
            name = "integration_instructions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(12.75f, 3.5f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 12f, 4.25f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 11.25f, 3.5f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 12.75f, 3.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(12.75f, 3.5f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 12f, 4.25f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 11.25f, 3.5f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 12.75f, 3.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(12.75f, 3.5f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 12f, 4.25f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 11.25f, 3.5f)
                    arcTo(0.75f, 0.75f, 0f, false, true, 12.75f, 3.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21f, 3f)
                    horizontalLineToRelative(-6.18f)
                    curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                    reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(11f, 14.17f)
                    lineToRelative(-1.41f, 1.42f)
                    lineTo(6f, 12f)
                    lineToRelative(3.59f, -3.59f)
                    lineTo(11f, 9.83f)
                    lineTo(8.83f, 12f)
                    lineTo(11f, 14.17f)
                    close()
                    moveTo(12f, 4.25f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(11.59f, 2.75f, 12f, 2.75f)
                    reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                    reflectiveCurveTo(12.41f, 4.25f, 12f, 4.25f)
                    close()
                    moveTo(14.41f, 15.59f)
                    lineTo(13f, 14.17f)
                    lineTo(15.17f, 12f)
                    lineTo(13f, 9.83f)
                    lineToRelative(1.41f, -1.42f)
                    lineTo(18f, 12f)
                    lineTo(14.41f, 15.59f)
                    close()
                }
            }
        }.build()
        
        return _Integration_instructions!!
    }

private var _Integration_instructions: ImageVector? = null

