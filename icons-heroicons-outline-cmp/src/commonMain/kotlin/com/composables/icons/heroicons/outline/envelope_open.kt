package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.EnvelopeOpen: ImageVector
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
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(21.75f, 9f)
                verticalLineToRelative(0.906f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.183f, 1.981f)
                lineToRelative(-6.478f, 3.488f)
                moveTo(2.25f, 9f)
                verticalLineToRelative(0.906f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 1.183f, 1.981f)
                lineToRelative(6.478f, 3.488f)
                moveToRelative(8.839f, 2.51f)
                lineToRelative(-4.66f, -2.51f)
                moveToRelative(0f, 0f)
                lineToRelative(-1.023f, -0.55f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.134f, 0f)
                lineToRelative(-1.022f, 0.55f)
                moveToRelative(0f, 0f)
                lineToRelative(-4.661f, 2.51f)
                moveToRelative(16.5f, 1.615f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, 2.25f)
                horizontalLineToRelative(-15f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, -2.25f)
                verticalLineTo(8.844f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 1.183f, -1.981f)
                lineToRelative(7.5f, -4.039f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.134f, 0f)
                lineToRelative(7.5f, 4.039f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 1.183f, 1.98f)
                verticalLineTo(19.5f)
                close()
            }
        }.build()
        
        return _EnvelopeOpen!!
    }

private var _EnvelopeOpen: ImageVector? = null

