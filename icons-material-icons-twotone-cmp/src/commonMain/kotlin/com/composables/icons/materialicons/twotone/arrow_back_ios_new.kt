package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Arrow_back_ios_new: ImageVector
    get() {
        if (_Arrow_back_ios_new != null) return _Arrow_back_ios_new!!
        
        _Arrow_back_ios_new = ImageVector.Builder(
            name = "arrow_back_ios_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17.77f, 3.77f)
                    lineTo(16f, 2f)
                    lineTo(6f, 12f)
                    lineTo(16f, 22f)
                    lineTo(17.77f, 20.23f)
                    lineTo(9.54f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Arrow_back_ios_new!!
    }

private var _Arrow_back_ios_new: ImageVector? = null

