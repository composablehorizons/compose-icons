package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CurrencyDollar: ImageVector
    get() {
        if (_CurrencyDollar != null) return _CurrencyDollar!!
        
        _CurrencyDollar = ImageVector.Builder(
            name = "currency-dollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.464f, 8.746f)
                curveToRelative(0.227f, -0.18f, 0.497f, -0.311f, 0.786f, -0.394f)
                verticalLineToRelative(2.795f)
                arcToRelative(2.252f, 2.252f, 0f, false, true, -0.786f, -0.393f)
                curveToRelative(-0.394f, -0.313f, -0.546f, -0.681f, -0.546f, -1.004f)
                curveToRelative(0f, -0.323f, 0.152f, -0.691f, 0.546f, -1.004f)
                close()
                moveTo(12.75f, 15.662f)
                verticalLineToRelative(-2.824f)
                curveToRelative(0.347f, 0.085f, 0.664f, 0.228f, 0.921f, 0.421f)
                curveToRelative(0.427f, 0.32f, 0.579f, 0.686f, 0.579f, 0.991f)
                curveToRelative(0f, 0.305f, -0.152f, 0.671f, -0.579f, 0.991f)
                arcToRelative(2.534f, 2.534f, 0f, false, true, -0.921f, 0.42f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveTo(12.75f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.816f)
                arcToRelative(3.836f, 3.836f, 0f, false, false, -1.72f, 0.756f)
                curveToRelative(-0.712f, 0.566f, -1.112f, 1.35f, -1.112f, 2.178f)
                curveToRelative(0f, 0.829f, 0.4f, 1.612f, 1.113f, 2.178f)
                curveToRelative(0.502f, 0.4f, 1.102f, 0.647f, 1.719f, 0.756f)
                verticalLineToRelative(2.978f)
                arcToRelative(2.536f, 2.536f, 0f, false, true, -0.921f, -0.421f)
                lineToRelative(-0.879f, -0.66f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.9f, 1.2f)
                lineToRelative(0.879f, 0.66f)
                curveToRelative(0.533f, 0.4f, 1.169f, 0.645f, 1.821f, 0.75f)
                verticalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.81f)
                arcToRelative(4.124f, 4.124f, 0f, false, false, 1.821f, -0.749f)
                curveToRelative(0.745f, -0.559f, 1.179f, -1.344f, 1.179f, -2.191f)
                curveToRelative(0f, -0.847f, -0.434f, -1.632f, -1.179f, -2.191f)
                arcToRelative(4.122f, 4.122f, 0f, false, false, -1.821f, -0.75f)
                verticalLineTo(8.354f)
                curveToRelative(0.29f, 0.082f, 0.559f, 0.213f, 0.786f, 0.393f)
                lineToRelative(0.415f, 0.33f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.933f, -1.175f)
                lineToRelative(-0.415f, -0.33f)
                arcToRelative(3.836f, 3.836f, 0f, false, false, -1.719f, -0.755f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _CurrencyDollar!!
    }

private var _CurrencyDollar: ImageVector? = null

