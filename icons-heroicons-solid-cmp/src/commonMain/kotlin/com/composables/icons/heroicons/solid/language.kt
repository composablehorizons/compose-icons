package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Language: ImageVector
    get() {
        if (_Language != null) return _Language!!
        
        _Language = ImageVector.Builder(
            name = "language",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.506f)
                arcToRelative(49.384f, 49.384f, 0f, false, true, 5.343f, 0.371f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.186f, 1.489f)
                curveToRelative(-0.66f, -0.083f, -1.323f, -0.151f, -1.99f, -0.206f)
                arcToRelative(18.67f, 18.67f, 0f, false, true, -2.97f, 6.323f)
                curveToRelative(0.318f, 0.384f, 0.65f, 0.753f, 1f, 1.107f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.07f, 1.052f)
                arcTo(18.902f, 18.902f, 0f, false, true, 9f, 13.687f)
                arcToRelative(18.823f, 18.823f, 0f, false, true, -5.656f, 4.482f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.688f, -1.333f)
                arcToRelative(17.323f, 17.323f, 0f, false, false, 5.396f, -4.353f)
                arcTo(18.72f, 18.72f, 0f, false, true, 5.89f, 8.598f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.388f, -0.568f)
                arcTo(17.21f, 17.21f, 0f, false, false, 9f, 11.224f)
                arcToRelative(17.168f, 17.168f, 0f, false, false, 2.391f, -5.165f)
                arcToRelative(48.04f, 48.04f, 0f, false, false, -8.298f, 0.307f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.186f, -1.489f)
                arcToRelative(49.159f, 49.159f, 0f, false, true, 5.343f, -0.371f)
                verticalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, false, true, 9f, 2.25f)
                close()
                moveTo(15.75f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.68f, 0.433f)
                lineToRelative(5.25f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.36f, 0.634f)
                lineToRelative(-1.198f, -2.567f)
                horizontalLineToRelative(-6.744f)
                lineToRelative(-1.198f, 2.567f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.36f, -0.634f)
                lineToRelative(5.25f, -11.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 15.75f, 9f)
                close()
                moveToRelative(-2.672f, 8.25f)
                horizontalLineToRelative(5.344f)
                lineToRelative(-2.672f, -5.726f)
                lineToRelative(-2.672f, 5.726f)
                close()
            }
        }.build()
        
        return _Language!!
    }

private var _Language: ImageVector? = null

