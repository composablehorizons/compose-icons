package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Card_travel: ImageVector
    get() {
        if (_Card_travel != null) return _Card_travel!!
        
        _Card_travel = ImageVector.Builder(
            name = "card_travel",
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
                moveTo(22f, 6f)
                horizontalLineToRelative(-5f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(20f)
                verticalLineTo(6f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                close()
                moveToRelative(11f, 15f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Card_travel!!
    }

private var _Card_travel: ImageVector? = null

