package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.BookOpen: ImageVector
    get() {
        if (_BookOpen != null) return _BookOpen!!
        
        _BookOpen = ImageVector.Builder(
            name = "book-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.25f, 4.533f)
                arcTo(9.707f, 9.707f, 0f, false, false, 6f, 3f)
                arcToRelative(9.735f, 9.735f, 0f, false, false, -3.25f, 0.555f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.5f, 0.707f)
                verticalLineToRelative(14.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1f, 0.707f)
                arcTo(8.237f, 8.237f, 0f, false, true, 6f, 18.75f)
                curveToRelative(1.995f, 0f, 3.823f, 0.707f, 5.25f, 1.886f)
                verticalLineTo(4.533f)
                close()
                moveTo(12.75f, 20.636f)
                arcTo(8.214f, 8.214f, 0f, false, true, 18f, 18.75f)
                curveToRelative(0.966f, 0f, 1.89f, 0.166f, 2.75f, 0.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1f, -0.708f)
                verticalLineTo(4.262f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.5f, -0.707f)
                arcTo(9.735f, 9.735f, 0f, false, false, 18f, 3f)
                arcToRelative(9.707f, 9.707f, 0f, false, false, -5.25f, 1.533f)
                verticalLineToRelative(16.103f)
                close()
            }
        }.build()
        
        return _BookOpen!!
    }

private var _BookOpen: ImageVector? = null

