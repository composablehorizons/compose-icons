package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CpuChip: ImageVector
    get() {
        if (_CpuChip != null) return _CpuChip!!
        
        _CpuChip = ImageVector.Builder(
            name = "cpu-chip",
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
                moveTo(8.25f, 3f)
                verticalLineToRelative(1.5f)
                moveTo(4.5f, 8.25f)
                horizontalLineTo(3f)
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-1.5f)
                moveTo(4.5f, 12f)
                horizontalLineTo(3f)
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(-15f, 3.75f)
                horizontalLineTo(3f)
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-1.5f)
                moveTo(8.25f, 19.5f)
                verticalLineTo(21f)
                moveTo(12f, 3f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 15f)
                verticalLineTo(21f)
                moveToRelative(3.75f, -18f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 15f)
                verticalLineTo(21f)
                moveToRelative(-9f, -1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineTo(6.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -2.25f)
                horizontalLineTo(6.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.5f, 6.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                close()
                moveToRelative(0.75f, -12f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-9f)
                close()
            }
        }.build()
        
        return _CpuChip!!
    }

private var _CpuChip: ImageVector? = null

