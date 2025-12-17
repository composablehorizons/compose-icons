package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandHeadlessui: ImageVector
    get() {
        if (_BrandHeadlessui != null) return _BrandHeadlessui!!
        
        _BrandHeadlessui = ImageVector.Builder(
            name = "brand-headlessui",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.744f, 4.325f)
                lineToRelative(7.82f, -1.267f)
                arcToRelative(4.456f, 4.456f, 0f, false, true, 5.111f, 3.686f)
                lineToRelative(1.267f, 7.82f)
                arcToRelative(4.456f, 4.456f, 0f, false, true, -3.686f, 5.111f)
                lineToRelative(-7.82f, 1.267f)
                arcToRelative(4.456f, 4.456f, 0f, false, true, -5.111f, -3.686f)
                lineToRelative(-1.267f, -7.82f)
                arcToRelative(4.456f, 4.456f, 0f, false, true, 3.686f, -5.111f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.252f, 7.704f)
                lineToRelative(7.897f, -1.28f)
                arcToRelative(1f, 1f, 0f, false, true, 1.147f, 0.828f)
                lineToRelative(0.36f, 2.223f)
                lineToRelative(-9.562f, 3.51f)
                lineToRelative(-0.67f, -4.134f)
                arcToRelative(1f, 1f, 0f, false, true, 0.828f, -1.147f)
                close()
            }
        }.build()
        
        return _BrandHeadlessui!!
    }

private var _BrandHeadlessui: ImageVector? = null

