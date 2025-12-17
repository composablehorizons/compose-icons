package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.EnvelopeOpen: ImageVector
    get() {
        if (_EnvelopeOpen != null) return _EnvelopeOpen!!
        
        _EnvelopeOpen = ImageVector.Builder(
            name = "envelope-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.5f, 22.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-8.174f)
                lineToRelative(-6.879f, 4.022f)
                lineToRelative(3.485f, 1.876f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.712f, 1.321f)
                lineToRelative(-5.683f, -3.06f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.422f, 0f)
                lineToRelative(-5.683f, 3.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.712f, -1.32f)
                lineToRelative(3.485f, -1.877f)
                lineTo(1.5f, 11.326f)
                verticalLineTo(19.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 9.589f)
                verticalLineToRelative(-0.745f)
                arcToRelative(3f, 3f, 0f, false, true, 1.578f, -2.642f)
                lineToRelative(7.5f, -4.038f)
                arcToRelative(3f, 3f, 0f, false, true, 2.844f, 0f)
                lineToRelative(7.5f, 4.038f)
                arcTo(3f, 3f, 0f, false, true, 22.5f, 8.844f)
                verticalLineToRelative(0.745f)
                lineToRelative(-8.426f, 4.926f)
                lineToRelative(-0.652f, -0.351f)
                arcToRelative(3f, 3f, 0f, false, false, -2.844f, 0f)
                lineToRelative(-0.652f, 0.351f)
                lineTo(1.5f, 9.589f)
                close()
            }
        }.build()
        
        return _EnvelopeOpen!!
    }

private var _EnvelopeOpen: ImageVector? = null

