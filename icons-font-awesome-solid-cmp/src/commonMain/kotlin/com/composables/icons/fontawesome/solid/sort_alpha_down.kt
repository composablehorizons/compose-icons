package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SortAlphaDown: ImageVector
    get() {
        if (_SortAlphaDown != null) return _SortAlphaDown!!
        
        _SortAlphaDown = ImageVector.Builder(
            name = "sort-alpha-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 352f)
                horizontalLineToRelative(-48f)
                verticalLineTo(48f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(304f)
                horizontalLineTo(16f)
                curveToRelative(-14.19f, 0f, -21.36f, 17.24f, -11.29f, 27.31f)
                lineToRelative(80f, 96f)
                arcToRelative(16f, 16f, 0f, false, false, 22.62f, 0f)
                lineToRelative(80f, -96f)
                curveTo(197.35f, 369.26f, 190.22f, 352f, 176f, 352f)
                close()
                moveToRelative(240f, -64f)
                horizontalLineTo(288f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(56f)
                lineToRelative(-61.26f, 70.45f)
                arcTo(32f, 32f, 0f, false, false, 272f, 446.37f)
                verticalLineTo(464f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(128f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-56f)
                lineToRelative(61.26f, -70.45f)
                arcTo(32f, 32f, 0f, false, false, 432f, 321.63f)
                verticalLineTo(304f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(31.06f, -85.38f)
                lineToRelative(-59.27f, -160f)
                arcTo(16f, 16f, 0f, false, false, 372.72f, 32f)
                horizontalLineToRelative(-41.44f)
                arcToRelative(16f, 16f, 0f, false, false, -15.07f, 10.62f)
                lineToRelative(-59.27f, 160f)
                arcTo(16f, 16f, 0f, false, false, 272f, 224f)
                horizontalLineToRelative(24.83f)
                arcToRelative(16f, 16f, 0f, false, false, 15.23f, -11.08f)
                lineToRelative(4.42f, -12.92f)
                horizontalLineToRelative(71f)
                lineToRelative(4.41f, 12.92f)
                arcTo(16f, 16f, 0f, false, false, 407.16f, 224f)
                horizontalLineTo(432f)
                arcToRelative(16f, 16f, 0f, false, false, 15.06f, -21.38f)
                close()
                moveTo(335.61f, 144f)
                lineTo(352f, 96f)
                lineToRelative(16.39f, 48f)
                close()
            }
        }.build()
        
        return _SortAlphaDown!!
    }

private var _SortAlphaDown: ImageVector? = null

