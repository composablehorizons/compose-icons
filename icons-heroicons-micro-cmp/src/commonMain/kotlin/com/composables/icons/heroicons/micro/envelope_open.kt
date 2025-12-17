package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.EnvelopeOpen: ImageVector
    get() {
        if (_EnvelopeOpen != null) return _EnvelopeOpen!!
        
        _EnvelopeOpen = ImageVector.Builder(
            name = "envelope-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.756f, 4.568f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 5.871f)
                verticalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 14f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(5.87f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.756f, -1.302f)
                lineToRelative(-5.5f, -3.143f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.488f, 0f)
                lineToRelative(-5.5f, 3.143f)
                close()
                moveToRelative(1.82f, 2.963f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.653f, 1.35f)
                lineToRelative(4.1f, 1.98f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 1.955f, 0f)
                lineToRelative(4.1f, -1.98f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.653f, -1.35f)
                lineTo(8.326f, 9.51f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.652f, 0f)
                lineTo(3.575f, 7.53f)
                close()
            }
        }.build()
        
        return _EnvelopeOpen!!
    }

private var _EnvelopeOpen: ImageVector? = null

