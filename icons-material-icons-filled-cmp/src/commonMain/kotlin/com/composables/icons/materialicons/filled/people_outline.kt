package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.People_outline: ImageVector
    get() {
        if (_People_outline != null) return _People_outline!!
        
        _People_outline = ImageVector.Builder(
            name = "people_outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 13f)
                curveToRelative(-1.2f, 0f, -3.07f, 0.34f, -4.5f, 1f)
                curveToRelative(-1.43f, -0.67f, -3.3f, -1f, -4.5f, -1f)
                curveTo(5.33f, 13f, 1f, 14.08f, 1f, 16.25f)
                verticalLineTo(19f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-2.75f)
                curveToRelative(0f, -2.17f, -4.33f, -3.25f, -6.5f, -3.25f)
                close()
                moveToRelative(-4f, 4.5f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0f, -0.54f, 2.56f, -1.75f, 5f, -1.75f)
                reflectiveCurveToRelative(5f, 1.21f, 5f, 1.75f)
                verticalLineToRelative(1.25f)
                close()
                moveToRelative(9f, 0f)
                horizontalLineTo(14f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0f, -0.46f, -0.2f, -0.86f, -0.52f, -1.22f)
                curveToRelative(0.88f, -0.3f, 1.96f, -0.53f, 3.02f, -0.53f)
                curveToRelative(2.44f, 0f, 5f, 1.21f, 5f, 1.75f)
                verticalLineToRelative(1.25f)
                close()
                moveTo(7.5f, 12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(9.43f, 5f, 7.5f, 5f)
                reflectiveCurveTo(4f, 6.57f, 4f, 8.5f)
                reflectiveCurveTo(5.57f, 12f, 7.5f, 12f)
                close()
                moveToRelative(0f, -5.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveToRelative(9f, 5.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(18.43f, 5f, 16.5f, 5f)
                reflectiveCurveTo(13f, 6.57f, 13f, 8.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveToRelative(0f, -5.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
            }
        }.build()
        
        return _People_outline!!
    }

private var _People_outline: ImageVector? = null

