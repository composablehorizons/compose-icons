package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Filter_1: ImageVector
    get() {
        if (_Filter_1 != null) return _Filter_1!!
        
        _Filter_1 = ImageVector.Builder(
            name = "filter_1",
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
                moveToRelative(11f, 10f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(9f, -14f)
                horizontalLineTo(5f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineTo(1f)
                close()
                moveToRelative(-2f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Filter_1!!
    }

private var _Filter_1: ImageVector? = null

