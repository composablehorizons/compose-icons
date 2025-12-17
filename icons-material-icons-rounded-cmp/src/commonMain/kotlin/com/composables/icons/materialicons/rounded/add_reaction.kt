package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Add_reaction: ImageVector
    get() {
        if (_Add_reaction != null) return _Add_reaction!!
        
        _Add_reaction = ImageVector.Builder(
            name = "add_reaction",
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
                moveTo(24f, 4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveTo(23.55f, 3f, 24f, 3.45f, 24f, 4f)
                close()
                moveTo(21.52f, 8.95f)
                curveTo(21.83f, 9.91f, 22f, 10.94f, 22f, 12f)
                curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.52f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                curveToRelative(1.5f, 0f, 2.92f, 0.34f, 4.2f, 0.94f)
                curveTo(16.08f, 3.27f, 16f, 3.62f, 16f, 4f)
                curveToRelative(0f, 1.35f, 0.9f, 2.5f, 2.13f, 2.87f)
                curveTo(18.5f, 8.1f, 19.65f, 9f, 21f, 9f)
                curveTo(21.18f, 9f, 21.35f, 8.98f, 21.52f, 8.95f)
                close()
                moveTo(7f, 9.5f)
                curveTo(7f, 10.33f, 7.67f, 11f, 8.5f, 11f)
                reflectiveCurveTo(10f, 10.33f, 10f, 9.5f)
                reflectiveCurveTo(9.33f, 8f, 8.5f, 8f)
                reflectiveCurveTo(7f, 8.67f, 7f, 9.5f)
                close()
                moveTo(16.31f, 14f)
                horizontalLineTo(7.69f)
                curveToRelative(-0.38f, 0f, -0.63f, 0.42f, -0.44f, 0.75f)
                curveTo(8.2f, 16.39f, 9.97f, 17.5f, 12f, 17.5f)
                reflectiveCurveToRelative(3.8f, -1.11f, 4.75f, -2.75f)
                curveTo(16.94f, 14.42f, 16.7f, 14f, 16.31f, 14f)
                close()
                moveTo(17f, 9.5f)
                curveTo(17f, 8.67f, 16.33f, 8f, 15.5f, 8f)
                reflectiveCurveTo(14f, 8.67f, 14f, 9.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(17f, 10.33f, 17f, 9.5f)
                close()
            }
        }.build()
        
        return _Add_reaction!!
    }

private var _Add_reaction: ImageVector? = null

