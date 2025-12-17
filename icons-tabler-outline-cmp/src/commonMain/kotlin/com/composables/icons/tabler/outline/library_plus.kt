package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.LibraryPlus: ImageVector
    get() {
        if (_LibraryPlus != null) return _LibraryPlus!!
        
        _LibraryPlus = ImageVector.Builder(
            name = "library-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 3f)
                moveToRelative(0f, 2.667f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(8.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, 2.667f, 2.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(2.667f, 2.667f, 0f, false, true, -2.667f, -2.667f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.012f, 7.26f)
                arcToRelative(2.005f, 2.005f, 0f, false, false, -1.012f, 1.737f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(0.75f, 0f, 1.158f, -0.385f, 1.5f, -1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 10f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _LibraryPlus!!
    }

private var _LibraryPlus: ImageVector? = null

