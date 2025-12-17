package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Note: ImageVector
    get() {
        if (_Note != null) return _Note!!
        
        _Note = ImageVector.Builder(
            name = "note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.41f, 9.41f)
                lineToRelative(-4.83f, -4.83f)
                curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12.01f)
                curveToRelative(0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f)
                horizontalLineTo(20f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-7.17f)
                curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.42f)
                close()
                moveTo(15f, 5.5f)
                lineToRelative(5.5f, 5.5f)
                horizontalLineTo(16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(5.5f)
                close()
            }
        }.build()
        
        return _Note!!
    }

private var _Note: ImageVector? = null

