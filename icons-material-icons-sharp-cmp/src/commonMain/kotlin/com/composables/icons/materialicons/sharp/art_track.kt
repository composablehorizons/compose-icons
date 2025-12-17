package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Art_track: ImageVector
    get() {
        if (_Art_track != null) return _Art_track!!
        
        _Art_track = ImageVector.Builder(
            name = "art_track",
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
                moveTo(22f, 13f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineTo(7f)
                close()
                moveToRelative(-8f, 10f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 7f)
                verticalLineToRelative(10f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(10f)
                close()
                moveToRelative(-1.5f, 8f)
                lineToRelative(-2.25f, -3f)
                lineToRelative(-1.75f, 2.26f)
                lineToRelative(-1.25f, -1.51f)
                lineTo(3.5f, 15f)
                horizontalLineToRelative(7f)
                close()
            }
        }.build()
        
        return _Art_track!!
    }

private var _Art_track: ImageVector? = null

