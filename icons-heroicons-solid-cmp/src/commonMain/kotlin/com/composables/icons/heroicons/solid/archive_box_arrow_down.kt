package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArchiveBoxArrowDown: ImageVector
    get() {
        if (_ArchiveBoxArrowDown != null) return _ArchiveBoxArrowDown!!
        
        _ArchiveBoxArrowDown = ImageVector.Builder(
            name = "archive-box-arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.375f, 3f)
                curveTo(2.339f, 3f, 1.5f, 3.84f, 1.5f, 4.875f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(17.25f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineToRelative(-0.75f)
                curveTo(22.5f, 3.839f, 21.66f, 3f, 20.625f, 3f)
                horizontalLineTo(3.375f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.087f, 9f)
                lineToRelative(0.54f, 9.176f)
                arcTo(3f, 3f, 0f, false, false, 6.62f, 21f)
                horizontalLineToRelative(10.757f)
                arcToRelative(3f, 3f, 0f, false, false, 2.995f, -2.824f)
                lineTo(20.913f, 9f)
                horizontalLineTo(3.087f)
                close()
                moveTo(12f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.94f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(1.72f, 1.72f)
                verticalLineToRelative(-4.94f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ArchiveBoxArrowDown!!
    }

private var _ArchiveBoxArrowDown: ImageVector? = null

