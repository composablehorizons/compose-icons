package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Near_me_disabled: ImageVector
    get() {
        if (_Near_me_disabled != null) return _Near_me_disabled!!
        
        _Near_me_disabled = ImageVector.Builder(
            name = "near_me_disabled",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6.34f)
                lineTo(21f, 3f)
                lineToRelative(-3.34f, 9f)
                lineTo(12f, 6.34f)
                close()
                moveTo(22.61f, 19.78f)
                lineTo(4.22f, 1.39f)
                lineTo(2.81f, 2.81f)
                lineToRelative(5.07f, 5.07f)
                lineTo(3f, 9.69f)
                verticalLineToRelative(1.41f)
                lineToRelative(7.07f, 2.83f)
                lineTo(12.9f, 21f)
                horizontalLineToRelative(1.41f)
                lineToRelative(1.81f, -4.88f)
                lineToRelative(5.07f, 5.07f)
                lineTo(22.61f, 19.78f)
                close()
            }
        }.build()
        
        return _Near_me_disabled!!
    }

private var _Near_me_disabled: ImageVector? = null

