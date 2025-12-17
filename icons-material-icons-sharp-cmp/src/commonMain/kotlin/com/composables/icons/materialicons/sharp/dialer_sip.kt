package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dialer_sip: ImageVector
    get() {
        if (_Dialer_sip != null) return _Dialer_sip!!
        
        _Dialer_sip = ImageVector.Builder(
            name = "dialer_sip",
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
                moveTo(16f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-1f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(3f, -2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(2f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(1f, 10.46f)
                lineToRelative(-5.27f, -0.61f)
                lineToRelative(-2.52f, 2.52f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.53f, -2.53f)
                lineTo(8.54f, 3f)
                horizontalLineTo(3.03f)
                curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21f, 20.97f)
                verticalLineToRelative(-5.51f)
                close()
            }
        }.build()
        
        return _Dialer_sip!!
    }

private var _Dialer_sip: ImageVector? = null

