package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Swatchbook: ImageVector
    get() {
        if (_Swatchbook != null) return _Swatchbook!!
        
        _Swatchbook = ImageVector.Builder(
            name = "swatchbook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(434.66f, 167.71f)
                horizontalLineToRelative(0f)
                lineTo(344.5f, 77.36f)
                arcToRelative(31.83f, 31.83f, 0f, false, false, -45f, -0.07f)
                horizontalLineToRelative(0f)
                lineToRelative(-0.07f, 0.07f)
                lineTo(224f, 152.88f)
                verticalLineTo(424f)
                lineTo(434.66f, 212.9f)
                arcTo(32f, 32f, 0f, false, false, 434.66f, 167.71f)
                close()
                moveTo(480f, 320f)
                horizontalLineTo(373.09f)
                lineTo(186.68f, 506.51f)
                curveToRelative(-2.06f, 2.07f, -4.5f, 3.58f, -6.68f, 5.49f)
                horizontalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(352f)
                arcTo(32f, 32f, 0f, false, false, 480f, 320f)
                close()
                moveTo(192f, 32f)
                arcTo(32f, 32f, 0f, false, false, 160f, 0f)
                horizontalLineTo(32f)
                arcTo(32f, 32f, 0f, false, false, 0f, 32f)
                verticalLineTo(416f)
                arcToRelative(96f, 96f, 0f, false, false, 192f, 0f)
                close()
                moveTo(96f, 440f)
                arcToRelative(24f, 24f, 0f, true, true, 24f, -24f)
                arcTo(24f, 24f, 0f, false, true, 96f, 440f)
                close()
                moveToRelative(32f, -184f)
                horizontalLineTo(64f)
                verticalLineTo(192f)
                horizontalLineToRelative(64f)
                close()
                moveToRelative(0f, -128f)
                horizontalLineTo(64f)
                verticalLineTo(64f)
                horizontalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _Swatchbook!!
    }

private var _Swatchbook: ImageVector? = null

