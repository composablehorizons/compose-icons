package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_sim: ImageVector
    get() {
        if (_No_sim != null) return _No_sim!!
        
        _No_sim = ImageVector.Builder(
            name = "no_sim",
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
                moveTo(3.79f, 3.74f)
                lineTo(2.38f, 5.15f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(-0.12f, 0.12f)
                verticalLineTo(21f)
                horizontalLineToRelative(13.27f)
                lineToRelative(1.58f, 1.62f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(19f, 16.11f)
                verticalLineTo(3f)
                horizontalLineToRelative(-8.99f)
                lineTo(7.95f, 5.06f)
                close()
            }
        }.build()
        
        return _No_sim!!
    }

private var _No_sim: ImageVector? = null

