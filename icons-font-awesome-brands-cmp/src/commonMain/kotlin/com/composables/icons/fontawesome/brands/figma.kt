package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Figma: ImageVector
    get() {
        if (_Figma != null) return _Figma!!
        
        _Figma = ImageVector.Builder(
            name = "figma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 95.7924f)
                curveTo(14f, 42.8877f, 56.8878f, 0f, 109.793f, 0f)
                horizontalLineTo(274.161f)
                curveTo(327.066f, 0f, 369.954f, 42.8877f, 369.954f, 95.7924f)
                curveTo(369.954f, 129.292f, 352.758f, 158.776f, 326.711f, 175.897f)
                curveTo(352.758f, 193.019f, 369.954f, 222.502f, 369.954f, 256.002f)
                curveTo(369.954f, 308.907f, 327.066f, 351.795f, 274.161f, 351.795f)
                horizontalLineTo(272.081f)
                curveTo(247.279f, 351.795f, 224.678f, 342.369f, 207.666f, 326.904f)
                verticalLineTo(415.167f)
                curveTo(207.666f, 468.777f, 163.657f, 512f, 110.309f, 512f)
                curveTo(57.5361f, 512f, 14f, 469.243f, 14f, 416.207f)
                curveTo(14f, 382.709f, 31.1945f, 353.227f, 57.2392f, 336.105f)
                curveTo(31.1945f, 318.983f, 14f, 289.5f, 14f, 256.002f)
                curveTo(14f, 222.502f, 31.196f, 193.019f, 57.2425f, 175.897f)
                curveTo(31.196f, 158.776f, 14f, 129.292f, 14f, 95.7924f)
                close()
                moveTo(176.288f, 191.587f)
                horizontalLineTo(109.793f)
                curveTo(74.2172f, 191.587f, 45.3778f, 220.427f, 45.3778f, 256.002f)
                curveTo(45.3778f, 291.44f, 73.9948f, 320.194f, 109.381f, 320.416f)
                curveTo(109.518f, 320.415f, 109.655f, 320.415f, 109.793f, 320.415f)
                horizontalLineTo(176.288f)
                verticalLineTo(191.587f)
                close()
                moveTo(207.666f, 256.002f)
                curveTo(207.666f, 291.577f, 236.505f, 320.417f, 272.081f, 320.417f)
                horizontalLineTo(274.161f)
                curveTo(309.737f, 320.417f, 338.576f, 291.577f, 338.576f, 256.002f)
                curveTo(338.576f, 220.427f, 309.737f, 191.587f, 274.161f, 191.587f)
                horizontalLineTo(272.081f)
                curveTo(236.505f, 191.587f, 207.666f, 220.427f, 207.666f, 256.002f)
                close()
                moveTo(109.793f, 351.795f)
                curveTo(109.655f, 351.795f, 109.518f, 351.794f, 109.381f, 351.794f)
                curveTo(73.9948f, 352.015f, 45.3778f, 380.769f, 45.3778f, 416.207f)
                curveTo(45.3778f, 451.652f, 74.6025f, 480.622f, 110.309f, 480.622f)
                curveTo(146.591f, 480.622f, 176.288f, 451.186f, 176.288f, 415.167f)
                verticalLineTo(351.795f)
                horizontalLineTo(109.793f)
                close()
                moveTo(109.793f, 31.3778f)
                curveTo(74.2172f, 31.3778f, 45.3778f, 60.2173f, 45.3778f, 95.7924f)
                curveTo(45.3778f, 131.368f, 74.2172f, 160.207f, 109.793f, 160.207f)
                horizontalLineTo(176.288f)
                verticalLineTo(31.3778f)
                horizontalLineTo(109.793f)
                close()
                moveTo(207.666f, 160.207f)
                horizontalLineTo(274.161f)
                curveTo(309.737f, 160.207f, 338.576f, 131.368f, 338.576f, 95.7924f)
                curveTo(338.576f, 60.2173f, 309.737f, 31.3778f, 274.161f, 31.3778f)
                horizontalLineTo(207.666f)
                verticalLineTo(160.207f)
                close()
            }
        }.build()
        
        return _Figma!!
    }

private var _Figma: ImageVector? = null

