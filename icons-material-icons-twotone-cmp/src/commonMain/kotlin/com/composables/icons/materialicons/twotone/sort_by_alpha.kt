package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sort_by_alpha: ImageVector
    get() {
        if (_Sort_by_alpha != null) return _Sort_by_alpha!!
        
        _Sort_by_alpha = ImageVector.Builder(
            name = "sort_by_alpha",
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
                moveTo(14.94f, 4.66f)
                lineTo(12.58f, 2.3f)
                lineToRelative(-2.36f, 2.36f)
                close()
                moveToRelative(-4.55f, 13.07f)
                horizontalLineToRelative(1.84f)
                lineTo(7.74f, 6.27f)
                horizontalLineTo(6.1f)
                lineTo(1.6f, 17.73f)
                horizontalLineToRelative(1.84f)
                lineToRelative(0.92f, -2.45f)
                horizontalLineToRelative(5.11f)
                lineToRelative(0.92f, 2.45f)
                close()
                moveToRelative(-5.42f, -4.09f)
                lineToRelative(1.94f, -5.18f)
                lineToRelative(1.94f, 5.18f)
                horizontalLineTo(4.97f)
                close()
                moveToRelative(7.61f, 8.06f)
                lineToRelative(2.33f, -2.33f)
                horizontalLineToRelative(-4.66f)
                close()
                moveToRelative(9.08f, -14.16f)
                verticalLineTo(6.28f)
                horizontalLineToRelative(-8.3f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(5.88f)
                lineToRelative(-5.92f, 8.56f)
                verticalLineToRelative(1.29f)
                horizontalLineToRelative(8.53f)
                verticalLineToRelative(-1.59f)
                horizontalLineToRelative(-6.12f)
                close()
            }
        }.build()
        
        return _Sort_by_alpha!!
    }

private var _Sort_by_alpha: ImageVector? = null

