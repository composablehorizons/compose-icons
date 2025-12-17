package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ToriiGate: ImageVector
    get() {
        if (_ToriiGate != null) return _ToriiGate!!
        
        _ToriiGate = ImageVector.Builder(
            name = "torii-gate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(376.45f, 32f)
                horizontalLineToRelative(-240.9f)
                arcTo(303.17f, 303.17f, 0f, false, true, 0f, 0f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(64f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(256f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(256f)
                horizontalLineToRelative(48f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(0f)
                arcToRelative(303.17f, 303.17f, 0f, false, true, -135.55f, 32f)
                close()
                moveTo(128f, 128f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(-64f)
                close()
                moveToRelative(256f, 64f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _ToriiGate!!
    }

private var _ToriiGate: ImageVector? = null

