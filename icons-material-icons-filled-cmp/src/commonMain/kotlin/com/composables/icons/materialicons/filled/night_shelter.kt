package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Night_shelter: ImageVector
    get() {
        if (_Night_shelter != null) return _Night_shelter!!
        
        _Night_shelter = ImageVector.Builder(
            name = "night_shelter",
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
                moveTo(12f, 3f)
                lineTo(4f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                verticalLineTo(9f)
                lineTo(12f, 3f)
                close()
                moveTo(9.75f, 12.5f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveTo(10.44f, 15f, 9.75f, 15f)
                reflectiveCurveTo(8.5f, 14.44f, 8.5f, 13.75f)
                reflectiveCurveTo(9.06f, 12.5f, 9.75f, 12.5f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.5f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineTo(18f)
                close()
            }
        }.build()
        
        return _Night_shelter!!
    }

private var _Night_shelter: ImageVector? = null

