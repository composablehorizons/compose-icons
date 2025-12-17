package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BookOpen: ImageVector
    get() {
        if (_BookOpen != null) return _BookOpen!!
        
        _BookOpen = ImageVector.Builder(
            name = "book-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.75f, 16.82f)
                arcTo(7.462f, 7.462f, 0f, false, true, 15f, 15.5f)
                curveToRelative(0.71f, 0f, 1.396f, 0.098f, 2.046f, 0.282f)
                arcTo(0.75f, 0.75f, 0f, false, false, 18f, 15.06f)
                verticalLineToRelative(-11f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.546f, -0.721f)
                arcTo(9.006f, 9.006f, 0f, false, false, 15f, 3f)
                arcToRelative(8.963f, 8.963f, 0f, false, false, -4.25f, 1.065f)
                verticalLineTo(16.82f)
                close()
                moveTo(9.25f, 4.065f)
                arcTo(8.963f, 8.963f, 0f, false, false, 5f, 3f)
                curveToRelative(-0.85f, 0f, -1.673f, 0.118f, -2.454f, 0.339f)
                arcTo(0.75f, 0.75f, 0f, false, false, 2f, 4.06f)
                verticalLineToRelative(11f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.954f, 0.721f)
                arcTo(7.506f, 7.506f, 0f, false, true, 5f, 15.5f)
                curveToRelative(1.579f, 0f, 3.042f, 0.487f, 4.25f, 1.32f)
                verticalLineTo(4.065f)
                close()
            }
        }.build()
        
        return _BookOpen!!
    }

private var _BookOpen: ImageVector? = null

