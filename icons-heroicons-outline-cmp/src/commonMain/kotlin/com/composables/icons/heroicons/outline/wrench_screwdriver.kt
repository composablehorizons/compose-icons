package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.WrenchScrewdriver: ImageVector
    get() {
        if (_WrenchScrewdriver != null) return _WrenchScrewdriver!!
        
        _WrenchScrewdriver = ImageVector.Builder(
            name = "wrench-screwdriver",
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
                moveTo(11.42f, 15.17f)
                lineTo(17.25f, 21f)
                arcTo(2.652f, 2.652f, 0f, false, false, 21f, 17.25f)
                lineToRelative(-5.877f, -5.877f)
                moveTo(11.42f, 15.17f)
                lineToRelative(2.496f, -3.03f)
                curveToRelative(0.317f, -0.384f, 0.74f, -0.626f, 1.208f, -0.766f)
                moveTo(11.42f, 15.17f)
                lineToRelative(-4.655f, 5.653f)
                arcToRelative(2.548f, 2.548f, 0f, true, true, -3.586f, -3.586f)
                lineToRelative(6.837f, -5.63f)
                moveToRelative(5.108f, -0.233f)
                curveToRelative(0.55f, -0.164f, 1.163f, -0.188f, 1.743f, -0.14f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 4.486f, -6.336f)
                lineToRelative(-3.276f, 3.277f)
                arcToRelative(3.004f, 3.004f, 0f, false, true, -2.25f, -2.25f)
                lineToRelative(3.276f, -3.276f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -6.336f, 4.486f)
                curveToRelative(0.091f, 1.076f, -0.071f, 2.264f, -0.904f, 2.95f)
                lineToRelative(-0.102f, 0.085f)
                moveToRelative(-1.745f, 1.437f)
                lineTo(5.909f, 7.5f)
                horizontalLineTo(4.5f)
                lineTo(2.25f, 3.75f)
                lineToRelative(1.5f, -1.5f)
                lineTo(7.5f, 4.5f)
                verticalLineToRelative(1.409f)
                lineToRelative(4.26f, 4.26f)
                moveToRelative(-1.745f, 1.437f)
                lineToRelative(1.745f, -1.437f)
                moveToRelative(6.615f, 8.206f)
                lineTo(15.75f, 15.75f)
                moveTo(4.867f, 19.125f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _WrenchScrewdriver!!
    }

private var _WrenchScrewdriver: ImageVector? = null

