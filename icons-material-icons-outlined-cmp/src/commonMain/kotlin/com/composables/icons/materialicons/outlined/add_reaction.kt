package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Add_reaction: ImageVector
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
                moveTo(7f, 9.5f)
                curveTo(7f, 8.67f, 7.67f, 8f, 8.5f, 8f)
                reflectiveCurveTo(10f, 8.67f, 10f, 9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveTo(7f, 10.33f, 7f, 9.5f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(2.33f, 0f, 4.31f, -1.46f, 5.11f, -3.5f)
                horizontalLineTo(6.89f)
                curveTo(7.69f, 16.04f, 9.67f, 17.5f, 12f, 17.5f)
                close()
                moveTo(15.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveTo(17f, 8.67f, 16.33f, 8f, 15.5f, 8f)
                reflectiveCurveTo(14f, 8.67f, 14f, 9.5f)
                curveTo(14f, 10.33f, 14.67f, 11f, 15.5f, 11f)
                close()
                moveTo(22f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(1f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.58f, -8f, -8f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                curveToRelative(1.46f, 0f, 2.82f, 0.4f, 4f, 1.08f)
                verticalLineTo(2.84f)
                curveTo(14.77f, 2.3f, 13.42f, 2f, 11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveToRelative(0f, -1.05f, -0.17f, -2.05f, -0.47f, -3f)
                horizontalLineToRelative(-2.13f)
                curveTo(19.78f, 9.93f, 20f, 10.94f, 20f, 12f)
                close()
            }
        }.build()
        
        return _Add_reaction!!
    }

private var _Add_reaction: ImageVector? = null

