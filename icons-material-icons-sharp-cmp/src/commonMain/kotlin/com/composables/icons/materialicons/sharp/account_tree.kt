package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Account_tree: ImageVector
    get() {
        if (_Account_tree != null) return _Account_tree!!
        
        _Account_tree = ImageVector.Builder(
            name = "account_tree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 11f)
                lineTo(22f, 3f)
                lineTo(15f, 3f)
                lineTo(15f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 3f)
                lineTo(2f, 3f)
                lineTo(2f, 11f)
                lineTo(9f, 11f)
                lineTo(9f, 8f)
                lineTo(11f, 8f)
                lineTo(11f, 18f)
                lineTo(15f, 18f)
                lineTo(15f, 21f)
                lineTo(22f, 21f)
                lineTo(22f, 13f)
                lineTo(15f, 13f)
                lineTo(15f, 16f)
                lineTo(13f, 16f)
                lineTo(13f, 8f)
                lineTo(15f, 8f)
                lineTo(15f, 11f)
                close()
            }
        }.build()
        
        return _Account_tree!!
    }

private var _Account_tree: ImageVector? = null

