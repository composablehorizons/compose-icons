package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.FingerPrint: ImageVector
    get() {
        if (_FingerPrint != null) return _FingerPrint!!
        
        _FingerPrint = ImageVector.Builder(
            name = "finger-print",
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
                moveTo(7.864f, 4.243f)
                arcTo(7.5f, 7.5f, 0f, false, true, 19.5f, 10.5f)
                curveToRelative(0f, 2.92f, -0.556f, 5.709f, -1.568f, 8.268f)
                moveTo(5.742f, 6.364f)
                arcTo(7.465f, 7.465f, 0f, false, false, 4.5f, 10.5f)
                arcToRelative(7.464f, 7.464f, 0f, false, true, -1.15f, 3.993f)
                moveToRelative(1.989f, 3.559f)
                arcTo(11.209f, 11.209f, 0f, false, false, 8.25f, 10.5f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, 7.5f, 0f)
                curveToRelative(0f, 0.527f, -0.021f, 1.049f, -0.064f, 1.565f)
                moveTo(12f, 10.5f)
                arcToRelative(14.94f, 14.94f, 0f, false, true, -3.6f, 9.75f)
                moveToRelative(6.633f, -4.596f)
                arcToRelative(18.666f, 18.666f, 0f, false, true, -2.485f, 5.33f)
            }
        }.build()
        
        return _FingerPrint!!
    }

private var _FingerPrint: ImageVector? = null

