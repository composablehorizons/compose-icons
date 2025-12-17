package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.NumberedList: ImageVector
    get() {
        if (_NumberedList != null) return _NumberedList!!
        
        _NumberedList = ImageVector.Builder(
            name = "numbered-list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(2f)
                arcTo(0.75f, 0.75f, 0f, false, false, 4f, 1.25f)
                horizontalLineTo(3f)
                close()
                moveTo(2.97f, 8.654f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 1.524f, -0.12f)
                arcToRelative(0.034f, 0.034f, 0f, false, true, -0.012f, 0.012f)
                lineTo(2.415f, 9.579f)
                arcTo(0.75f, 0.75f, 0f, false, false, 2f, 10.25f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(3.927f)
                lineToRelative(1.225f, -0.613f)
                curveToRelative(0.52f, -0.26f, 0.848f, -0.79f, 0.848f, -1.371f)
                curveToRelative(0f, -0.647f, -0.429f, -1.327f, -1.193f, -1.451f)
                arcToRelative(5.03f, 5.03f, 0f, false, false, -2.277f, 0.155f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.44f, 1.434f)
                close()
                moveTo(7.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(7.75f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(7.75f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(2.625f, 13.875f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.125f, 0.125f, 0f, false, true, 0f, 0.25f)
                horizontalLineTo(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.625f)
                arcToRelative(0.125f, 0.125f, 0f, false, true, 0f, 0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.625f, 1.625f, 0f, false, false, 1.37f, -2.5f)
                arcToRelative(1.625f, 1.625f, 0f, false, false, -1.37f, -2.5f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }.build()
        
        return _NumberedList!!
    }

private var _NumberedList: ImageVector? = null

