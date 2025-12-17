package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Filter_9_plus: ImageVector
    get() {
        if (_Filter_9_plus != null) return _Filter_9_plus!!
        
        _Filter_9_plus = ImageVector.Builder(
            name = "filter_9_plus",
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
                moveTo(3f, 5f)
                horizontalLineTo(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                close()
                moveToRelative(11f, 9f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                close()
                moveToRelative(-3f, -5f)
                verticalLineTo(8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(12f, -8f)
                horizontalLineTo(5f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(1f)
                close()
                moveToRelative(-2f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Filter_9_plus!!
    }

private var _Filter_9_plus: ImageVector? = null

