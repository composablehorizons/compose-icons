package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Nature_people: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.17f, 9.17f)
                curveToRelative(0f, -3.91f, -3.19f, -7.06f, -7.11f, -7f)
                curveToRelative(-3.83f, 0.06f, -6.99f, 3.37f, -6.88f, 7.19f)
                curveToRelative(0.09f, 3.38f, 2.58f, 6.16f, 5.83f, 6.7f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                horizontalLineTo(2f)
                verticalLineToRelative(5f)
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

