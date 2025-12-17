package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.AcademicCap: ImageVector
    get() {
        if (_AcademicCap != null) return _AcademicCap!!
        
        _AcademicCap = ImageVector.Builder(
            name = "academic-cap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(4.26f, 10.147f)
                arcToRelative(60.438f, 60.438f, 0f, false, false, -0.491f, 6.347f)
                arcTo(48.62f, 48.62f, 0f, false, true, 12f, 20.904f)
                arcToRelative(48.62f, 48.62f, 0f, false, true, 8.232f, -4.41f)
                arcToRelative(60.46f, 60.46f, 0f, false, false, -0.491f, -6.347f)
                moveToRelative(-15.482f, 0f)
                arcToRelative(50.636f, 50.636f, 0f, false, false, -2.658f, -0.813f)
                arcTo(59.906f, 59.906f, 0f, false, true, 12f, 3.493f)
                arcToRelative(59.903f, 59.903f, 0f, false, true, 10.399f, 5.84f)
                curveToRelative(-0.896f, 0.248f, -1.783f, 0.52f, -2.658f, 0.814f)
                moveToRelative(-15.482f, 0f)
                arcTo(50.717f, 50.717f, 0f, false, true, 12f, 13.489f)
                arcToRelative(50.702f, 50.702f, 0f, false, true, 7.74f, -3.342f)
                moveTo(6.75f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-3.675f)
                arcTo(55.378f, 55.378f, 0f, false, true, 12f, 8.443f)
                moveToRelative(-7.007f, 11.55f)
                arcTo(5.981f, 5.981f, 0f, false, false, 6.75f, 15.75f)
                verticalLineToRelative(-1.5f)
            }
        }.build()
        
        return _AcademicCap!!
    }

private var _AcademicCap: ImageVector? = null

