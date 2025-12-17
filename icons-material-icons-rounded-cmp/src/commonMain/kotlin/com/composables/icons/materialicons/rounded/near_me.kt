package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Near_me: ImageVector
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
                moveTo(18.75f, 3.94f)
                lineTo(4.07f, 10.08f)
                curveToRelative(-0.83f, 0.35f, -0.81f, 1.53f, 0.02f, 1.85f)
                lineTo(9.43f, 14f)
                curveToRelative(0.26f, 0.1f, 0.47f, 0.31f, 0.57f, 0.57f)
                lineToRelative(2.06f, 5.33f)
                curveToRelative(0.32f, 0.84f, 1.51f, 0.86f, 1.86f, 0.03f)
                lineToRelative(6.15f, -14.67f)
                curveToRelative(0.33f, -0.83f, -0.5f, -1.66f, -1.32f, -1.32f)
                close()
            }
        }.build()
        
        return _Near_me!!
    }

private var _Near_me: ImageVector? = null

