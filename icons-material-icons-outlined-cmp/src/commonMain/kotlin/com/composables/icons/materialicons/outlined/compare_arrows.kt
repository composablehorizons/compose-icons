package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Compare_arrows: ImageVector
    get() {
        if (_Compare_arrows != null) return _Compare_arrows!!
        
        _Compare_arrows = ImageVector.Builder(
            name = "compare_arrows",
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
                moveTo(9.01f, 14f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7.01f)
                verticalLineToRelative(3f)
                lineTo(13f, 15f)
                lineToRelative(-3.99f, -4f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(5.98f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineToRelative(-7.01f)
                verticalLineTo(5f)
                lineTo(11f, 9f)
                lineToRelative(3.99f, 4f)
                close()
            }
        }.build()
        
        return _Compare_arrows!!
    }

private var _Compare_arrows: ImageVector? = null

