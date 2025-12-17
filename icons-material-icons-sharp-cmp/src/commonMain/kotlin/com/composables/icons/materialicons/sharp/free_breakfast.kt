package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Free_breakfast: ImageVector
    get() {
        if (_Free_breakfast != null) return _Free_breakfast!!
        
        _Free_breakfast = ImageVector.Builder(
            name = "free_breakfast",
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
                moveTo(20f, 3f)
                horizontalLineTo(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(4f, 19f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Free_breakfast!!
    }

private var _Free_breakfast: ImageVector? = null

