package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Card_membership: ImageVector
    get() {
        if (_Card_membership != null) return _Card_membership!!
        
        _Card_membership = ImageVector.Builder(
            name = "card_membership",
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
                moveTo(22f, 2f)
                horizontalLineTo(2f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                lineToRelative(4f, -2f)
                lineToRelative(4f, 2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(6f)
                verticalLineTo(2f)
                close()
                moveToRelative(-2f, 13f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Card_membership!!
    }

private var _Card_membership: ImageVector? = null

