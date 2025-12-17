package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Near_me: ImageVector
    get() {
        if (_Near_me != null) return _Near_me!!
        
        _Near_me = ImageVector.Builder(
            name = "near_me",
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
                moveTo(11.39f, 12.61f)
                lineToRelative(0.32f, 0.83f)
                lineToRelative(1.32f, 3.42f)
                lineToRelative(4.24f, -10.13f)
                lineToRelative(-10.13f, 4.24f)
                lineToRelative(3.42f, 1.33f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 11.51f)
                lineToRelative(6.84f, 2.65f)
                lineTo(12.48f, 21f)
                horizontalLineToRelative(0.98f)
                lineTo(21f, 3f)
                lineTo(3f, 10.53f)
                verticalLineToRelative(0.98f)
                close()
                moveToRelative(14.27f, -4.78f)
                lineToRelative(-4.24f, 10.13f)
                lineToRelative(-1.32f, -3.42f)
                lineToRelative(-0.32f, -0.83f)
                lineToRelative(-0.82f, -0.32f)
                lineToRelative(-3.43f, -1.33f)
                lineToRelative(10.13f, -4.23f)
                close()
            }
        }.build()
        
        return _Near_me!!
    }

private var _Near_me: ImageVector? = null

