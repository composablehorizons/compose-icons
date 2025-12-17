package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Analytics: ImageVector
    get() {
        if (_Analytics != null) return _Analytics!!
        
        _Analytics = ImageVector.Builder(
            name = "analytics",
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(7f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(15f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                close()
                moveTo(9f, 17f)
                horizontalLineTo(7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineTo(17f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineTo(17f)
                close()
                moveTo(13f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(12f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Analytics!!
    }

private var _Analytics: ImageVector? = null

