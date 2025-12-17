package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Directions: ImageVector
    get() {
        if (_Directions != null) return _Directions!!
        
        _Directions = ImageVector.Builder(
            name = "directions",
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
                moveTo(21.71f, 11.29f)
                lineToRelative(-9f, -9f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-9f, 9f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(9f, 9f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(9f, -9f)
                curveToRelative(0.39f, -0.38f, 0.39f, -1.01f, 0f, -1.41f)
                close()
                moveTo(14f, 14.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                verticalLineTo(7.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
                close()
            }
        }.build()
        
        return _Directions!!
    }

private var _Directions: ImageVector? = null

