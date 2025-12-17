package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Credit_card: ImageVector
    get() {
        if (_Credit_card != null) return _Credit_card!!
        
        _Credit_card = ImageVector.Builder(
            name = "credit_card",
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
                moveTo(22f, 4f)
                horizontalLineTo(2.01f)
                lineTo(2f, 20f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveToRelative(-2f, 14f)
                horizontalLineTo(4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(0f, -10f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Credit_card!!
    }

private var _Credit_card: ImageVector? = null

