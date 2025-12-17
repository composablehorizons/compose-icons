package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Nature_people: ImageVector
    get() {
        if (_Nature_people != null) return _Nature_people!!
        
        _Nature_people = ImageVector.Builder(
            name = "nature_people",
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
                moveTo(22.17f, 9.17f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.13f, -7f, 7f)
                curveToRelative(0f, 3.47f, 2.52f, 6.34f, 5.83f, 6.89f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.88f)
                curveToRelative(3.47f, -0.41f, 6.17f, -3.36f, 6.17f, -6.95f)
                close()
                moveTo(4.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(5.33f, 8f, 4.5f, 8f)
                reflectiveCurveTo(3f, 8.67f, 3f, 9.5f)
                reflectiveCurveTo(3.67f, 11f, 4.5f, 11f)
                close()
            }
        }.build()
        
        return _Nature_people!!
    }

private var _Nature_people: ImageVector? = null

